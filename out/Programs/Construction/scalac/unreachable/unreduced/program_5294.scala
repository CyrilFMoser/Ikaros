package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[(Byte,Byte), Boolean],(Int,(Char,Boolean)))) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F, b: T_B[F, F]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: CC_B[G], b: T_A[G, T_B[G, G]], c: G) extends T_A[G, T_B[G, G]]
case class CC_D[I, H](a: (CC_A[Byte],CC_C[Boolean]), b: CC_B[I]) extends T_B[I, H]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, CC_D(_, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}