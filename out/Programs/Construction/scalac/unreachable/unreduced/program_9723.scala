package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], T_A[(Boolean,Boolean), T_A[(Byte,Char), Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], T_A[(Boolean,Boolean), T_A[(Byte,Char), Boolean]]]
case class CC_C(a: CC_B, b: CC_B, c: T_A[CC_A, CC_B]) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], T_A[(Boolean,Boolean), T_A[(Byte,Char), Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], T_A[(Boolean,Boolean), T_A[(Byte,Char), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}