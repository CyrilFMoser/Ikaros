package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: (T_A[(Char,Char), (Char,Byte)],(Char,Boolean))) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: E, b: T_A[E, T_A[E, E]], c: T_B) extends T_A[E, T_A[E, E]]
case class CC_C[F, G](a: G, b: CC_B[F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_C(_, _), _) => 3 
  case CC_C(_, CC_B(_, _, _)) => 4 
}
}