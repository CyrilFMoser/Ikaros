package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[(Boolean,Byte), Int],T_A[(Boolean,Boolean), Byte]), C]
case class CC_B(a: T_A[Char, CC_A[Byte]]) extends T_A[(T_A[(Boolean,Byte), Int],T_A[(Boolean,Boolean), Byte]), T_A[CC_A[Int], T_A[Int, Boolean]]]
case class CC_C(a: Char, b: T_A[((Byte,Char),CC_B), T_A[(Boolean,Boolean), CC_B]], c: (CC_B,T_A[CC_B, CC_B])) extends T_A[(T_A[(Boolean,Byte), Int],T_A[(Boolean,Boolean), Byte]), T_A[CC_A[Int], T_A[Int, Boolean]]]

val v_a: T_A[(T_A[(Boolean,Byte), Int],T_A[(Boolean,Boolean), Byte]), T_A[CC_A[Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, (CC_B(_),_)) => 2 
}
}