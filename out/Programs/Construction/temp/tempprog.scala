object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Int)]], b: (T_A[Boolean],T_A[Byte])) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C[B](a: T_A[T_A[Boolean]]) extends T_A[B]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B()) => 3 
  case CC_C(CC_C(_)) => 4 
}
}