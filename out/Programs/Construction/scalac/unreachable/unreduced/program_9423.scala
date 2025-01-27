package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: Int, c: T_A[D, E]) extends T_A[D, E]
case class CC_B[F]() extends T_A[Boolean, F]
case class CC_C() extends T_A[Boolean, Int]
case class CC_D(a: T_A[T_A[Boolean, Int], T_A[Int, (Byte,Boolean)]]) extends T_B[(T_A[Boolean, Int],T_A[Boolean, Int])]
case class CC_E(a: T_A[CC_B[(Char,Byte)], Int], b: (CC_B[(Int,Char)],CC_C), c: T_B[T_B[CC_D]]) extends T_B[(T_A[Boolean, Int],T_A[Boolean, Int])]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B())) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B()) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B() => 5 
  case CC_C() => 6 
}
}