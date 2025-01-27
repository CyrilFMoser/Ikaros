package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_B[E, E], c: E) extends T_B[E, CC_A[E]]
case class CC_C[F](a: T_A[F]) extends T_B[F, CC_A[F]]
case class CC_D[G](a: CC_C[G], b: (CC_A[Byte],CC_C[Boolean]), c: (T_B[Boolean, Char],CC_A[Int])) extends T_B[T_B[(Byte,Byte), CC_A[(Byte,Byte)]], G]

val v_a: T_B[Byte, CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, 0) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A()) => 2 
}
}