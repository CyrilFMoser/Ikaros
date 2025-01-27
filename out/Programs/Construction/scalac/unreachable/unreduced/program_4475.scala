package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Byte)]]) extends T_A[((Byte,(Int,Int)),(Boolean,Char))]
case class CC_B() extends T_A[((Byte,(Int,Int)),(Boolean,Char))]
case class CC_C() extends T_A[((Byte,(Int,Int)),(Boolean,Char))]

val v_a: T_A[((Byte,(Int,Int)),(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}