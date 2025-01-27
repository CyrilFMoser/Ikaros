package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: (T_B,(T_B,(Boolean,Boolean)))) extends T_A[(T_B,Int)]
case class CC_B(a: T_A[CC_A], b: T_B) extends T_B
case class CC_C(a: CC_B, b: T_A[(T_B,Int)], c: CC_B) extends T_B
case class CC_D(a: (CC_A,CC_C), b: T_A[(T_B,Int)], c: T_A[(T_B,Int)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C(_, CC_A(_, _), _)) => 1 
  case CC_B(_, CC_D((_,_), CC_A(_, _), CC_A(_, _))) => 2 
  case CC_C(_, CC_A(_, _), CC_B(_, CC_B(_, _))) => 3 
  case CC_C(_, CC_A(_, _), CC_B(_, CC_D(_, _, _))) => 4 
  case CC_D((CC_A(_, _),CC_C(_, _, _)), CC_A(_, _), _) => 5 
}
}
// This is not matched: CC_C(_, CC_A(_, _), CC_B(_, CC_C(_, _, _)))