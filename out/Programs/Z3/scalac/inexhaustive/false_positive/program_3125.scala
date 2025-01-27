package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int) extends T_A[(Char,(Boolean,Byte))]

val v_a: T_A[(Char,(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Boolean Byte Boolean (T_A Boolean Byte))