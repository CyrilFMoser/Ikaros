package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (T_A[Boolean],T_B[Byte, Boolean])) extends T_A[D]
case class CC_B(a: Char, b: CC_A[T_A[Int]]) extends T_A[Int]
case class CC_C(a: T_A[CC_A[CC_B]], b: CC_B, c: CC_B) extends T_A[Int]
case class CC_D[E](a: T_B[E, CC_B]) extends T_B[E, CC_B]
case class CC_E[F](a: T_A[Int], b: T_B[F, CC_B], c: T_B[F, CC_B]) extends T_B[F, CC_B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(CC_A(_, _), (_,_)), _, _) => 2 
}
}