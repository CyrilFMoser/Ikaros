package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (Byte,T_A[Char, Int])) extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], T_B[T_A[Boolean, (Boolean,Boolean)]]]
case class CC_B[D]() extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], T_B[T_A[Boolean, (Boolean,Boolean)]]]
case class CC_C() extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], T_B[T_A[Boolean, (Boolean,Boolean)]]]
case class CC_D[E](a: CC_C, b: T_B[E]) extends T_B[E]
case class CC_E[F](a: T_B[F], b: T_B[T_B[F]]) extends T_B[F]
case class CC_F[G](a: CC_B[G], b: T_A[G, G]) extends T_B[G]

val v_a: T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], T_B[T_A[Boolean, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}