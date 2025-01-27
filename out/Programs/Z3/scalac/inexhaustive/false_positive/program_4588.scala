package Program_13 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D]() extends T_B[C, T_A]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Int T_A (T_B Int T_A))
// This is not matched: (CC_A Byte Byte (T_A Byte))