package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[Int, Char], T_A[Byte, Char]]) extends T_A[T_A[Char, T_A[Char, Char]], T_A[(Boolean,(Char,Int)), T_A[Boolean, Char]]]
case class CC_B() extends T_A[T_A[Char, T_A[Char, Char]], T_A[(Boolean,(Char,Int)), T_A[Boolean, Char]]]
case class CC_C(a: CC_B, b: Int) extends T_A[T_A[Char, T_A[Char, Char]], T_A[(Boolean,(Char,Int)), T_A[Boolean, Char]]]

val v_a: T_A[T_A[Char, T_A[Char, Char]], T_A[(Boolean,(Char,Int)), T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)