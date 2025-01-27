package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (CC_A,Char), b: T_B[T_B[T_A, Boolean], CC_A], c: T_A) extends T_A
case class CC_C[C](a: T_A, b: (CC_A,Boolean)) extends T_B[C, Char]
case class CC_D[D]() extends T_B[D, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B((CC_A(_),_), _, CC_A(CC_A(_))) => 3 
  case CC_B((CC_A(_),_), _, CC_A(CC_B(_, _, _))) => 4 
  case CC_B((CC_A(_),_), _, CC_B(_, _, _)) => 5 
}
}