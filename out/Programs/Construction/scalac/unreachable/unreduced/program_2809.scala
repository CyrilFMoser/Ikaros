package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Byte,Byte), Int], Int], (T_A[Boolean, Byte],T_A[Int, Boolean])]
case class CC_B() extends T_A[T_A[T_A[(Byte,Byte), Int], Int], (T_A[Boolean, Byte],T_A[Int, Boolean])]
case class CC_C(a: CC_A, b: T_A[CC_B, (CC_B,Boolean)], c: CC_B) extends T_A[T_A[T_A[(Byte,Byte), Int], Int], (T_A[Boolean, Byte],T_A[Int, Boolean])]

val v_a: T_A[T_A[T_A[(Byte,Byte), Int], Int], (T_A[Boolean, Byte],T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}