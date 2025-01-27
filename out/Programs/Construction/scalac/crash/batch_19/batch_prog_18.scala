package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Char,Byte),T_A[Int])) extends T_A[B]
case class CC_B() extends T_A[T_A[T_A[Byte]]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}