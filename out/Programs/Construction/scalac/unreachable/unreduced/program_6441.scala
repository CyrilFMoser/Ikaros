package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, (T_B,Int)], b: T_B, c: T_B) extends T_A[Int, T_A[T_A[T_B, T_B], T_A[Char, T_B]]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: CC_B, c: T_B) extends T_B
case class CC_D(a: (Char,T_A[T_B, CC_C])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_B(), CC_B()) => 1 
  case CC_C(CC_B(), CC_B(), CC_C(_, CC_B(), _)) => 2 
  case CC_C(CC_B(), CC_B(), CC_D((_,_))) => 3 
  case CC_C(CC_C(_, _, _), CC_B(), CC_B()) => 4 
  case CC_C(CC_C(_, _, _), CC_B(), CC_C(_, CC_B(), _)) => 5 
  case CC_C(CC_C(_, _, _), CC_B(), CC_D((_,_))) => 6 
  case CC_C(CC_D(_), CC_B(), CC_B()) => 7 
  case CC_C(CC_D(_), CC_B(), CC_C(_, CC_B(), _)) => 8 
  case CC_C(CC_D(_), CC_B(), CC_D((_,_))) => 9 
  case CC_D((_,_)) => 10 
}
}