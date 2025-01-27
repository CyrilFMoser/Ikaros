package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[T_A[Int]]) extends T_A[Byte]
case class CC_C(a: CC_A[(CC_B,CC_B)], b: T_A[CC_A[Byte]], c: T_A[Boolean]) extends T_A[Byte]
case class CC_D[E](a: T_A[CC_B]) extends T_B[CC_C, CC_A[CC_B]]
case class CC_E(a: Int, b: T_A[Byte], c: (T_A[Char],T_B[CC_C, CC_B])) extends T_B[CC_C, CC_A[CC_B]]

val v_a: T_B[CC_C, CC_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, CC_A(_), (_,_)) => 1 
  case CC_E(_, CC_C(_, _, _), (_,_)) => 2 
}
}
// This is not matched: CC_E(_, CC_B(_, _), (_,_))