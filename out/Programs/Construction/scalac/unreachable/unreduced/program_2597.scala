package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[(Char,Boolean), Byte]], b: T_A[T_B[Boolean, Int]]) extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_C() extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_D[D](a: Int, b: T_A[D], c: CC_A) extends T_B[D, CC_A]
case class CC_E(a: CC_B, b: Char) extends T_B[T_B[T_B[CC_A, CC_A], CC_A], CC_A]

val v_a: T_A[T_B[T_A[Char], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()