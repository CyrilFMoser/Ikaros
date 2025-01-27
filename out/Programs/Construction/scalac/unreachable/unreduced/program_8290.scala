package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[T_B[Int], T_A[Byte, Int]], D]
case class CC_B[E](a: CC_A[E], b: (T_A[Boolean, Byte],CC_A[Int])) extends T_B[E]
case class CC_C[F](a: T_B[F], b: F) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), (_,CC_A())) => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}