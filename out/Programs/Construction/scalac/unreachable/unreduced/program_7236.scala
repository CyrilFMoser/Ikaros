package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C[C](a: T_A[C], b: CC_A, c: CC_B) extends T_B[C]
case class CC_D() extends T_B[T_B[T_B[CC_B]]]
case class CC_E(a: CC_C[T_B[CC_B]], b: Char, c: (CC_C[CC_D],CC_B)) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B() => 1 
}
}