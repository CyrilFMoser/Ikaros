package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[(Char,Byte), T_A[Char, Boolean]], c: T_A[Boolean, (Int,Char)]) extends T_A[T_A[Char, T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], T_A[Boolean, Char]]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]], b: CC_A) extends T_A[T_A[CC_A, Int], CC_A]
case class CC_C[C]() extends T_A[T_A[Char, T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], T_A[Boolean, Char]]]

val v_a: T_A[T_A[Char, T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}