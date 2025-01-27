package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Boolean, Char],(Char,Int))) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_A[T_A[T_A[T_A[Byte, Int], (Boolean,Int)], T_A[T_A[Byte, Int], (Boolean,Int)]], T_A[T_A[Byte, Int], (Boolean,Int)]]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_C(CC_B()) => 3 
  case CC_C(CC_C(_)) => 4 
}
}