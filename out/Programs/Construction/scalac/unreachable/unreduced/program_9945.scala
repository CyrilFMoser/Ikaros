package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_B, c: (((Char,Boolean),(Boolean,Char)),(T_B,(Char,Char)))) extends T_A[Byte]
case class CC_B(a: T_A[T_B], b: T_B, c: CC_A) extends T_A[Byte]
case class CC_C[B](a: Int) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),(_,_))) => 0 
  case CC_B(_, _, _) => 1 
}
}