package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[((Char,Boolean),T_B), T_A[T_B, T_B]], c: T_B) extends T_A[T_A[T_B, T_A[Byte, Boolean]], T_B]
case class CC_B(a: T_B, b: T_A[T_A[Char, CC_A], T_B]) extends T_A[T_A[T_B, T_A[Byte, Boolean]], T_B]
case class CC_C() extends T_A[T_A[T_B, T_A[Byte, Boolean]], T_B]
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: T_A[T_A[CC_D, CC_B], CC_D], b: (T_A[(Boolean,Int), CC_B],CC_D)) extends T_B

val v_a: T_A[T_A[T_B, T_A[Byte, Boolean]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_E(_, (_,_))) => 1 
  case CC_B(CC_D(CC_A(_, _, _)), _) => 2 
  case CC_B(CC_E(_, (_,_)), _) => 3 
  case CC_C() => 4 
}
}