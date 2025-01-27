package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Byte, T_A[Boolean, (Boolean,Char)]], T_A[Byte, T_A[Byte, Char]]]
case class CC_B(a: (Int,T_A[Byte, CC_A]), b: T_A[CC_A, CC_A], c: Int) extends T_A[T_A[Byte, T_A[Boolean, (Boolean,Char)]], T_A[Byte, T_A[Byte, Char]]]
case class CC_C(a: CC_A) extends T_A[T_A[Byte, T_A[Boolean, (Boolean,Char)]], T_A[Byte, T_A[Byte, Char]]]

val v_a: T_A[T_A[Byte, T_A[Boolean, (Boolean,Char)]], T_A[Byte, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)