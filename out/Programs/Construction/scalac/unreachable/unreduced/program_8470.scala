package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: (T_A[Int],(Byte,Boolean))) extends T_A[T_A[(Int,(Byte,Byte))]]
case class CC_B(a: CC_A) extends T_A[T_A[(Int,(Byte,Byte))]]
case class CC_C(a: CC_B) extends T_A[T_A[(Int,(Byte,Byte))]]

val v_a: T_A[T_A[(Int,(Byte,Byte))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))