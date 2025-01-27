package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[Byte]
case class CC_B(a: Int, b: CC_A) extends T_A[Byte]
case class CC_C(a: (T_A[Int],T_A[CC_A])) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_)) => 2 
}
}