package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[Int],(T_B,T_B)), b: T_A[Int], c: Char) extends T_A[Int]
case class CC_B(a: ((CC_A,T_B),T_A[(Char,Byte)]), b: (Byte,T_B), c: CC_A) extends T_A[Int]
case class CC_C(a: Boolean, b: T_A[Int], c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_C(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_C(_, CC_B((_,_), (_,_), CC_A(_, _, _)), _) => 2 
}
}