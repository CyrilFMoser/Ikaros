package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B[D]() extends T_B[D, T_A]
case class CC_C(a: T_A, b: T_B[T_A, CC_A[T_A]], c: T_B[(Int,(Int,Byte)), T_A]) extends T_B[CC_A[CC_A[Int]], T_A]
case class CC_D[E](a: (T_B[T_A, CC_C],T_B[CC_C, T_A]), b: Int, c: T_B[E, T_A]) extends T_B[E, T_A]

val v_a: T_B[CC_A[CC_A[Int]], T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
  case CC_C(_, _, CC_D(_, _, _)) => 2 
  case CC_D(_, _, CC_B()) => 3 
  case CC_D(_, _, CC_D(_, _, _)) => 4 
}
}
// This is not matched: CC_D(_, _, CC_C(_, _, _))