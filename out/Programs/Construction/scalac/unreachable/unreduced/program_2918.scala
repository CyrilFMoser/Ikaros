package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[Char], b: T_A[CC_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A[CC_B]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)