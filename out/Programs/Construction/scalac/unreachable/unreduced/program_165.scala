package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: CC_A, b: T_A[(T_B,(Byte,Int))], c: CC_A) extends T_A[(T_A[T_B],T_B)]
case class CC_C(a: CC_B, b: CC_B, c: (T_B,T_B)) extends T_B
case class CC_D(a: T_A[T_A[CC_B]], b: T_B) extends T_B
case class CC_E(a: T_B, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _, (_,_)) => 0 
  case CC_D(_, CC_C(_, _, _)) => 1 
  case CC_D(_, CC_D(_, _)) => 2 
  case CC_E(CC_C(_, _, _), _) => 3 
  case CC_E(CC_D(_, _), _) => 4 
  case CC_E(CC_E(_, _), _) => 5 
}
}
// This is not matched: CC_D(_, CC_E(_, _))