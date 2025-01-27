package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], T_A[(Boolean,Boolean), (Int,Boolean)]]) extends T_A[T_A[((Boolean,Byte),Byte), T_A[Int, Boolean]], T_A[T_A[Byte, Char], T_A[Int, (Boolean,Byte)]]]
case class CC_B() extends T_A[T_A[((Boolean,Byte),Byte), T_A[Int, Boolean]], T_A[T_A[Byte, Char], T_A[Int, (Boolean,Byte)]]]

val v_a: T_A[T_A[((Boolean,Byte),Byte), T_A[Int, Boolean]], T_A[T_A[Byte, Char], T_A[Int, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}