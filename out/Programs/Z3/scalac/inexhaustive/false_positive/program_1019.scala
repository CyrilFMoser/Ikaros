package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(Boolean,Byte), C]
case class CC_B(a: Char, b: T_A[Boolean, (Int,Boolean)]) extends T_A[(Boolean,Byte), CC_A[Int]]

val v_a: T_A[(Boolean,Byte), CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x', _) => 1 
}
}
// This is not matched: Pattern match is empty without constants