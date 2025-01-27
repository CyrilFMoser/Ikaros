package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_A[Int],(Int,T_B)), c: (T_A[Int],T_A[T_B])) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, (_,CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_B(), _, _), _, (_,CC_A(_, _, _))) => 1 
  case CC_A(CC_B(), _, (_,CC_A(_, _, _))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, (_,CC_B())) => 3 
  case CC_A(CC_A(CC_B(), _, _), _, (_,CC_B())) => 4 
  case CC_A(CC_B(), _, (_,CC_B())) => 5 
  case CC_B() => 6 
}
}