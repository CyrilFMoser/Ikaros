package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]]) extends T_A[T_A[Char]]
case class CC_B(a: Char, b: Int, c: T_A[T_A[(Int,Boolean)]]) extends T_A[T_A[Char]]
case class CC_C(a: (T_A[CC_B],T_A[CC_A]), b: CC_A, c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_D(a: T_B[CC_B], b: Char, c: CC_A) extends T_B[CC_B]
case class CC_E(a: ((CC_D,CC_A),T_B[Boolean]), b: T_B[CC_B], c: Char) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, CC_A(_)), _, _) => 0 
  case CC_D(CC_E(_, CC_D(_, _, _), _), _, _) => 1 
  case CC_D(CC_E(_, CC_E(_, _, _), _), _, _) => 2 
}
}
// This is not matched: CC_E(_, _, _)