package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Char,Boolean), (Boolean,Int)], T_A[Int, Char]], T_A[T_A[Boolean, Char], Boolean]]
case class CC_B(a: CC_A, b: (T_A[CC_A, CC_A],T_A[CC_A, CC_A]), c: Int) extends T_A[T_A[T_A[(Char,Boolean), (Boolean,Int)], T_A[Int, Char]], T_A[T_A[Boolean, Char], Boolean]]
case class CC_C(a: T_A[CC_A, (CC_B,Byte)], b: CC_B) extends T_A[T_A[T_A[(Char,Boolean), (Boolean,Int)], T_A[Int, Char]], T_A[T_A[Boolean, Char], Boolean]]

val v_a: T_A[T_A[T_A[(Char,Boolean), (Boolean,Int)], T_A[Int, Char]], T_A[T_A[Boolean, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,_), _) => 1 
  case CC_C(_, _) => 2 
}
}