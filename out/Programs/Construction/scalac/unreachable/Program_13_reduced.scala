object Test {
sealed trait T_A[A, B]
case class CC_A(a:      Int                                     , b:         Byte                         , c:     T_A[Boolean, Boolean]                 ) extends T_A[T_A[T_A[Int, Char], T_A[Int, (Char,Boolean)]], T_A[T_A[Char, Char], T_A[Boolean, (Byte,Int)]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Int, Char], T_A[Int, (Char,Boolean)]], T_A[T_A[Char, Char], T_A[Boolean, (Byte,Int)]]]
val v_a: T_A[T_A[T_A[Int, Char], T_A[Int, (Char,Boolean)]], T_A[T_A[Char, Char], T_A[Boolean, (Byte,Int)]]] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_C(_) => 2
}
}
