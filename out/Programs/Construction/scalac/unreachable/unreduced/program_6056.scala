package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Int]
case class CC_B[B](a: (Char,T_A[Byte]), b: (T_A[CC_A],CC_A)) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), (_,CC_A(_))) => 1 
}
}