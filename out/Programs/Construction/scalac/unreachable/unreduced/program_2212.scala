package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Int, c: ((Int,Byte),(Int,Byte))) extends T_A[T_A[((Boolean,Boolean),Char)]]
case class CC_B() extends T_A[T_A[((Boolean,Boolean),Char)]]
case class CC_C(a: CC_A) extends T_A[T_A[((Boolean,Boolean),Char)]]

val v_a: T_A[T_A[((Boolean,Boolean),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, 12, (_,_))) => 2 
  case CC_C(CC_A(_, _, (_,_))) => 3 
}
}