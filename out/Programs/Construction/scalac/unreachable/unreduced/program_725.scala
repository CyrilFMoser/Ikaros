package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Boolean, Byte],T_A[(Byte,Byte), Boolean]), T_A[Byte, ((Boolean,Char),Byte)]]
case class CC_B(a: Boolean, b: CC_A, c: T_A[T_A[CC_A, CC_A], Boolean]) extends T_A[(T_A[Boolean, Byte],T_A[(Byte,Byte), Boolean]), T_A[Byte, ((Boolean,Char),Byte)]]
case class CC_C(a: CC_B, b: (CC_B,CC_A), c: T_A[CC_A, (CC_B,Boolean)]) extends T_A[(T_A[Boolean, Byte],T_A[(Byte,Byte), Boolean]), T_A[Byte, ((Boolean,Char),Byte)]]

val v_a: T_A[(T_A[Boolean, Byte],T_A[(Byte,Byte), Boolean]), T_A[Byte, ((Boolean,Char),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, CC_A(), _) => 1 
  case CC_B(false, CC_A(), _) => 2 
  case CC_C(CC_B(_, _, _), (_,_), _) => 3 
}
}