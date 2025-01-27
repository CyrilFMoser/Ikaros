package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Byte,Int), C], b: (Boolean,Byte)) extends T_A[C, T_A[C, Int]]

val v_a: T_A[Boolean, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C T_B) (CC_D T_B)) T_B)