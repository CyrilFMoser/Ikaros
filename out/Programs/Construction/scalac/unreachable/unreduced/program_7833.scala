package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: (CC_A[(Boolean,Byte)],T_A[Boolean])) extends T_B[E, T_A[E]]
case class CC_C[F](a: F, b: T_A[F]) extends T_B[F, T_A[F]]
case class CC_D[G](a: T_B[G, T_A[G]], b: CC_B[G], c: T_A[G]) extends T_B[G, T_A[G]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_B(CC_A(_, _), (_,_)), _, CC_A(_, _)) => 2 
  case CC_D(CC_C(_, CC_A(_, _)), _, CC_A(_, _)) => 3 
  case CC_D(CC_D(CC_B(_, _), CC_B(_, _), CC_A(_, _)), _, CC_A(_, _)) => 4 
  case CC_D(CC_D(CC_C(_, _), CC_B(_, _), CC_A(_, _)), _, CC_A(_, _)) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_D(_, _, _), CC_B(_, _), CC_A(_, _)), _, CC_A(_, _))