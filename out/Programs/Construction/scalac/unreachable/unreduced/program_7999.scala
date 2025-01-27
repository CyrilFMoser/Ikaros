package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[Char], c: Int) extends T_A[Char]
case class CC_C(a: T_A[CC_A], b: CC_A, c: (CC_B,T_A[CC_A])) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_B(CC_A(), CC_B(CC_A(), CC_A(), _), _) => 1 
  case CC_B(CC_A(), CC_B(CC_A(), CC_B(_, _, _), _), _) => 2 
  case CC_B(CC_A(), CC_B(CC_A(), CC_C(_, _, _), _), _) => 3 
  case CC_B(CC_A(), CC_C(_, _, _), _) => 4 
  case CC_C(_, CC_A(), (CC_B(_, _, _),_)) => 5 
}
}
// This is not matched: CC_A()