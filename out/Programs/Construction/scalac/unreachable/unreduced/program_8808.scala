package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: (Byte,(Int,Char))) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_B[Char, F]) extends T_B[Char, F]
case class CC_D[G](a: CC_B[G], b: T_B[Char, T_A[G]], c: Char) extends T_B[G, (T_A[Int],T_A[Byte])]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, true, (_,(_,_))) => 0 
  case CC_A(_, false, (_,(_,_))) => 1 
  case CC_B() => 2 
}
}