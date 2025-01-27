package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: (T_B[Int],Int), c: Boolean) extends T_A
case class CC_C() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_B(_, _, _)) => 2 
  case CC_B(CC_A(12, _, CC_A(_, _, _)), (_,_), _) => 3 
  case CC_B(CC_A(12, _, CC_B(_, _, _)), (_,_), _) => 4 
  case CC_B(CC_A(_, _, CC_B(_, _, _)), (_,_), _) => 5 
  case CC_B(CC_B(_, _, _), (_,_), _) => 6 
}
}
// This is not matched: CC_B(CC_A(_, _, CC_A(_, _, _)), (_,_), _)