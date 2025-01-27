package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[D, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: Boolean) extends T_A[Char, (Char,T_A[(Char,Byte), Byte])]
case class CC_C(a: T_A[CC_B, CC_B], b: CC_A[CC_A[CC_B, (Boolean,Boolean)], T_A[CC_B, CC_B]]) extends T_A[T_A[T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]], T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]]], T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]]]

val v_a: T_A[T_A[T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]], T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]]], T_A[T_A[CC_A[CC_B, (Boolean,Byte)], CC_A[CC_B, (Boolean,Byte)]], CC_A[CC_B, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
}
}