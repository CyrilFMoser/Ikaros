package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: ((CC_A,(Int,Int)),(Boolean,CC_A)), b: T_A[Int], c: CC_A) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_B((_,_), CC_A(_), CC_A(_)), CC_A(_)) => 2 
  case CC_B(_, CC_B((_,_), CC_B(_, _, _), CC_A(_)), CC_A(_)) => 3 
  case CC_B(_, CC_B((_,_), CC_C(), CC_A(_)), CC_A(_)) => 4 
  case CC_B(_, CC_C(), CC_A(_)) => 5 
  case CC_C() => 6 
}
}