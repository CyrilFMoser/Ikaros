package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Boolean,Byte)]], E]
case class CC_B[F](a: Boolean, b: CC_A[F], c: T_A[F, F]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Boolean,Byte)]], F]
case class CC_C[G, H](a: T_A[G, H], b: (T_A[Char, Byte],T_B[Byte, Boolean])) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Boolean,Byte)]], G]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Boolean, (Boolean,Byte)]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C(_, (_,_)) => 2 
}
}