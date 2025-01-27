package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Int, Int], T_B[Boolean, Byte]]) extends T_A
case class CC_B[C](a: Int) extends T_B[T_A, C]
case class CC_C[D](a: Boolean, b: CC_B[D], c: CC_B[D]) extends T_B[T_A, D]
case class CC_D[E](a: CC_B[E], b: (CC_B[CC_A],CC_C[T_A]), c: CC_A) extends T_B[T_A, E]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, (CC_B(_),CC_C(_, _, _)), CC_A(_)) => 2 
}
}