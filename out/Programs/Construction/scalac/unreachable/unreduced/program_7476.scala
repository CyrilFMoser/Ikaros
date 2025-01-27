package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[Byte], c: T_A[CC_A]) extends T_A[Byte]
case class CC_C(a: CC_B, b: (CC_A,T_A[Byte]), c: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_C(CC_B(_, _, _), (_,_), _), _) => 3 
  case CC_C(_, _, _) => 4 
}
}