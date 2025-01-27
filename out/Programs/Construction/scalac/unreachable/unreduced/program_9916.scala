package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,T_A[Char]), b: Int) extends T_A[Int]
case class CC_B(a: Char, b: CC_A, c: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A((_,_), _), CC_A(_, _)) => 1 
  case CC_B(_, CC_A((_,_), _), CC_B(_, _, CC_A(_, _))) => 2 
  case CC_B(_, CC_A((_,_), _), CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_B(_, CC_A((_,_), _), CC_B(_, _, CC_C())) => 4 
  case CC_B(_, CC_A((_,_), _), CC_C()) => 5 
  case CC_C() => 6 
}
}