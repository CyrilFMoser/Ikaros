package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: F, b: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, T_A[G, G]], b: Char) extends T_B[T_B[(Byte,Boolean), (Boolean,Byte)], G]
case class CC_D(a: (CC_B[Char],T_B[Byte, Int]), b: T_A[Char, T_A[Char, Char]], c: CC_A[CC_A[Int]]) extends T_B[T_B[(Byte,Boolean), (Boolean,Byte)], Byte]
case class CC_E(a: T_A[CC_D, T_B[CC_D, CC_D]], b: T_B[T_A[CC_D, CC_D], Int]) extends T_B[T_B[(Byte,Boolean), (Boolean,Byte)], Byte]

val v_a: T_B[T_B[(Byte,Boolean), (Boolean,Byte)], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, CC_A()), _) => 1 
  case CC_C(CC_B(_, CC_B(_, _)), _) => 2 
  case CC_D(_, _, _) => 3 
  case CC_E(_, _) => 4 
}
}