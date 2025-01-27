package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[(Byte,Int), C]

val v_a: T_A[(Byte,Int), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (Tuple Byte Int) Int))
// This is not matched: (CC_B T_A)