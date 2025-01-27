package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: Char, b: E, c: T_A[E]) extends T_B[E, Byte]
case class CC_C[F](a: T_A[F], b: (T_A[Boolean],T_A[Char])) extends T_B[F, Byte]
case class CC_D[G](a: T_B[T_B[G, Boolean], Byte], b: G) extends T_B[G, Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(true, _)) => 0 
  case CC_B(_, _, CC_A(false, _)) => 1 
  case CC_C(_, (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_D(CC_B('x', _, CC_A(_, _)), _) => 3 
  case CC_D(CC_B(_, _, CC_A(_, _)), _) => 4 
  case CC_D(CC_C(CC_A(_, _), (_,_)), _) => 5 
  case CC_D(CC_D(_, _), _) => 6 
}
}