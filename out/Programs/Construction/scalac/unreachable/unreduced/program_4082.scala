package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: (T_A[(Int,Boolean)],T_B[Char, Int])) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[G, CC_B[CC_B[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(),_)) => 1 
  case CC_A(_, (CC_C(_, _),_)) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}